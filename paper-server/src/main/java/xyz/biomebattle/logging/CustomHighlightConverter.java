package xyz.biomebattle.logging;

import java.util.List;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "CustomHighlight", category = PatternConverter.CATEGORY)
@ConverterKeys({"hl", "customHighlight"})
public class CustomHighlightConverter extends LogEventPatternConverter {


    private static final int DISPLAY_WIDTH = 8;

    protected CustomHighlightConverter(String name, String style) {
        super(name, style);
    }

    public static CustomHighlightConverter newInstance(String[] options) {
        return new CustomHighlightConverter("CustomHighlight", "customHighlight");
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        String level = event.getLevel().name();
        LogType logType = LogType.valueOf(level);

        boolean needsExtraChar = List.of("WARN", "INFO", "FATAL").contains(level);


        toAppendTo.append(logType.prettyLogLevel.prefixFormatting.getAsString());


        String content = logType.prettyLogLevel.emoji + " " + logType.prettyLogLevel.prefix;


        toAppendTo.append(" ");


        toAppendTo.append(content);

        if (needsExtraChar) toAppendTo.append(" ");


        int paddingNeeded = DISPLAY_WIDTH - visualLength(content);


        for (int i = 0; i < paddingNeeded; i++) {
            toAppendTo.append(" ");
        }


        toAppendTo.append(logType.prettyLogLevel.messageFormatting.getAsString());
    }

    /**
     * Estimates the visual length of a string, adjusting for emoji characters
     * which may have different display widths
     */
    private int visualLength(String str) {


        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isSurrogate(c) || c == '\uFE0F') {

                length += 1;

                if (i < str.length() - 1 && Character.isSurrogatePair(c, str.charAt(i + 1))) {
                    i++;
                }
            } else {
                length += 1;
            }
        }
        return length;
    }
}
