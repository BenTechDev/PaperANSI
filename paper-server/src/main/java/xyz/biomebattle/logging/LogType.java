package xyz.biomebattle.logging;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public enum LogType {
    TRACE(new PrettyLogLevel(
            "🎶", "TRACE",
            FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.PURPLE, List.of(ANSI.Style.BOLD)),
            FormattingComponents.of(ANSI.Foreground.PURPLE, null, List.of())
    )),
    DEBUG(new PrettyLogLevel(
          "🔎", "DEBUG",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BLUE, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.BLUE, null, List.of())
    )),
    SUCCESS(new PrettyLogLevel(
          "✅", "SUCCESS",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_GREEN, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.BRIGHT_GREEN, null, List.of())
    )),
    INFO(new PrettyLogLevel(
          "ℹ️", "INFO",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_BLUE, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.BRIGHT_BLUE, null, List.of())
    )),
    WARN(new PrettyLogLevel(
          "⚠️", "WARN",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_YELLOW, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.BRIGHT_YELLOW, null, List.of())
    )),
    ERROR(new PrettyLogLevel(
          "🚨", "ERROR",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_RED, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.BRIGHT_RED, null, List.of())
    )),
    FATAL(new PrettyLogLevel(
          "☠️", "FATAL",
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_RED, List.of(ANSI.Style.BOLD)),
          FormattingComponents.of(ANSI.Foreground.WHITE, ANSI.Background.BRIGHT_RED, List.of(ANSI.Style.BOLD))
    )),
    ;

    public final @NotNull PrettyLogLevel prettyLogLevel;

    LogType(@NotNull PrettyLogLevel prettyLogLevel) {
        this.prettyLogLevel = prettyLogLevel;
    }
}
