package xyz.biomebattle.logging;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class FormattingComponents {
    private final @Nullable ANSI.Foreground foreground;
    private final @Nullable ANSI.Background background;
    private final @Nullable List<ANSI.Style> styles;

    private FormattingComponents(@Nullable ANSI.Foreground foreground, @Nullable ANSI.Background background, @Nullable List<ANSI.Style> styles) {
        this.foreground = foreground;
        this.background = background;
        this.styles = styles;
    }

    public static FormattingComponents of(@Nullable ANSI.Foreground foreground, @Nullable ANSI.Background background, @Nullable List<ANSI.Style> styles) {
        return new FormattingComponents(foreground, background, styles);
    }

    public @NotNull String format(@NotNull String input) {
        StringBuilder builder = new StringBuilder();

        if (styles != null) {
            for (ANSI.Style style : styles) {
                builder.append(style.code);
            }
        }

        if (foreground != null) builder.append(foreground.code);
        if (background != null) builder.append(background.code);

        builder.append(input);
        builder.append(ANSI.Style.RESET.code);
        return builder.toString();
    }

    public @NotNull ANSI.Foreground getForeground() {
        return foreground;
    }

    public @NotNull ANSI.Background getBackground() {
        return background;
    }

    public @NotNull List<ANSI.Style> getStyles() {
        return styles;
    }

    public String getAsString() {
        StringBuilder builder = new StringBuilder();
        if (background != null) builder.append(background.code); else builder.append(ANSI.Style.RESET.code);
        if (foreground != null) builder.append(foreground.code);
        if (styles != null) {
            for (ANSI.Style style : styles) {
                builder.append(style.code);
            }
        }
        return builder.toString();
    }
}
