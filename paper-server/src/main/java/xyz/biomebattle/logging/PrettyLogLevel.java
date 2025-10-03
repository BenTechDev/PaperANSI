package xyz.biomebattle.logging;

import org.jetbrains.annotations.NotNull;

public class PrettyLogLevel {

    public final @NotNull String emoji;
    public final @NotNull String prefix;
    public final @NotNull FormattingComponents prefixFormatting;
    public final @NotNull FormattingComponents messageFormatting;

    public PrettyLogLevel(@NotNull String emoji, @NotNull String prefix, @NotNull FormattingComponents prefixFormatting, @NotNull FormattingComponents messageFormatting) {
        this.emoji = emoji;
        this.prefix = prefix;
        this.prefixFormatting = prefixFormatting;
        this.messageFormatting = messageFormatting;
    }

    public @NotNull String formatMessage(final @NotNull String message) {
//        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String timestamp = ""; // Paper's logger already has timestamps!

        StringBuilder prefixBuilder = new StringBuilder(prefix);
        // Just format yourself, I don't want to remove flexibility by forcing this.
//        if (prefixBuilder.length() > 6) {
//            prefixBuilder.setLength(6);
//            prefixBuilder.append("-");
//        } else {
//            while (prefixBuilder.length() < 6) {
//                prefixBuilder.append(" ");
//            }
//        }

        prefixBuilder.insert(0, (emoji + "  "));
        String formattedPrefix = prefixBuilder.toString();

        return String.format(
              "[%s] %s %s",
              timestamp,
              prefixFormatting.format(formattedPrefix),
              messageFormatting.format(message)
        );
    }

}

