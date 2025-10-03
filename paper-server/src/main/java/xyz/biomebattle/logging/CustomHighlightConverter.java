package xyz.biomebattle.logging;

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
        String levelEmoji = getLevelEmoji(level);
        LogStyle style = getStyleForLevel(level);

        boolean isInfoOrWarn = level.equals("INFO") || level.equals("WARN");


        if (style.getBackgroundColor() != null) {
            toAppendTo.append(style.getBackgroundColor().getCode());
        }


        toAppendTo.append(style.getTextColor().getCode());


        String content = levelEmoji + " " + level;


        toAppendTo.append(" ");


        toAppendTo.append(content);

        if (isInfoOrWarn) toAppendTo.append(" ");


        int paddingNeeded = DISPLAY_WIDTH - visualLength(content);


        for (int i = 0; i < paddingNeeded; i++) {
            toAppendTo.append(" ");
        }


        toAppendTo.append(AnsiColor.RESET.getCode());
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

    private LogStyle getStyleForLevel(String level) {
        switch (level) {
            case "FATAL":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.DARK_RED_BACKGROUND);
            case "ERROR":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.RED_BACKGROUND);
            case "WARN":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.YELLOW_BACKGROUND);
            case "INFO":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.CYAN_BACKGROUND);
            case "DEBUG":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.GRAY_BACKGROUND);
            case "TRACE":
                return new LogStyle(AnsiColor.BLACK, AnsiColor.LIGHT_BLUE_BACKGROUND);
            default:
                return LogStyle.WHITE;
        }
    }

    private String getLevelEmoji(String level) {
        switch (level) {
            case "FATAL":
                return "💀";
            case "ERROR":
                return "⛔";
            case "WARN":
                return "⚠\uFE0F";
            case "INFO":
                return "ℹ\uFE0F";
            case "DEBUG":
                return "🔧";
            case "TRACE":
                return "🔍";
            default:
                return "";
        }
    }
}