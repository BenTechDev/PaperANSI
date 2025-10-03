package xyz.biomebattle.logging;

public class LogStyle {
    private final AnsiColor textColor;
    private final AnsiColor backgroundColor;

    public LogStyle(AnsiColor textColor, AnsiColor backgroundColor) {
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    public LogStyle(AnsiColor textColor) {
        this(textColor, null);
    }

    public AnsiColor getTextColor() {
        return textColor;
    }

    public AnsiColor getBackgroundColor() {
        return backgroundColor;
    }

    // Predefined styles
    public static final LogStyle BLACK = new LogStyle(AnsiColor.BLACK);
    public static final LogStyle RED = new LogStyle(AnsiColor.RED);
    public static final LogStyle GREEN = new LogStyle(AnsiColor.GREEN);
    public static final LogStyle YELLOW = new LogStyle(AnsiColor.YELLOW);
    public static final LogStyle BLUE = new LogStyle(AnsiColor.BLUE);
    public static final LogStyle PURPLE = new LogStyle(AnsiColor.PURPLE);
    public static final LogStyle CYAN = new LogStyle(AnsiColor.CYAN);
    public static final LogStyle WHITE = new LogStyle(AnsiColor.WHITE);
    public static final LogStyle BRIGHT_BLACK = new LogStyle(AnsiColor.BRIGHT_BLACK);
    public static final LogStyle BRIGHT_RED = new LogStyle(AnsiColor.BRIGHT_RED);
    public static final LogStyle BRIGHT_GREEN = new LogStyle(AnsiColor.BRIGHT_GREEN);
    public static final LogStyle BRIGHT_YELLOW = new LogStyle(AnsiColor.BRIGHT_YELLOW);
    public static final LogStyle BRIGHT_BLUE = new LogStyle(AnsiColor.BRIGHT_BLUE);
    public static final LogStyle BRIGHT_PURPLE = new LogStyle(AnsiColor.BRIGHT_PURPLE);
    public static final LogStyle BRIGHT_CYAN = new LogStyle(AnsiColor.BRIGHT_CYAN);
    public static final LogStyle BRIGHT_WHITE = new LogStyle(AnsiColor.BRIGHT_WHITE);
    public static final LogStyle GRAY = new LogStyle(AnsiColor.GRAY);
    public static final LogStyle ORANGE = new LogStyle(AnsiColor.ORANGE);
    public static final LogStyle PINK = new LogStyle(AnsiColor.PINK);
    public static final LogStyle CUTE_PINK = new LogStyle(AnsiColor.CUTE_PINK);
    public static final LogStyle AQUA = new LogStyle(AnsiColor.AQUA);
    public static final LogStyle GOLD = new LogStyle(AnsiColor.GOLD);
    public static final LogStyle LIGHT_GREEN = new LogStyle(AnsiColor.LIGHT_GREEN);
    public static final LogStyle LIGHT_BLUE = new LogStyle(AnsiColor.LIGHT_BLUE);
    public static final LogStyle MAGENTA = new LogStyle(AnsiColor.MAGENTA);
    public static final LogStyle LIGHT_CYAN = new LogStyle(AnsiColor.LIGHT_CYAN);
    public static final LogStyle LIGHT_GRAY = new LogStyle(AnsiColor.LIGHT_GRAY);
    public static final LogStyle DARK_RED = new LogStyle(AnsiColor.DARK_RED);
    public static final LogStyle DARK_GREEN = new LogStyle(AnsiColor.DARK_GREEN);
    public static final LogStyle DARK_BLUE = new LogStyle(AnsiColor.DARK_BLUE);
    public static final LogStyle DARK_YELLOW = new LogStyle(AnsiColor.DARK_YELLOW);
    public static final LogStyle DARK_PURPLE = new LogStyle(AnsiColor.DARK_PURPLE);

    // Filled styles
    public static final LogStyle FILLED_BLACK = new LogStyle(AnsiColor.WHITE, AnsiColor.BLACK_BACKGROUND);
    public static final LogStyle FILLED_RED = new LogStyle(AnsiColor.BLACK, AnsiColor.RED_BACKGROUND);
    public static final LogStyle FILLED_GREEN = new LogStyle(AnsiColor.BLACK, AnsiColor.GREEN_BACKGROUND);
    public static final LogStyle FILLED_YELLOW = new LogStyle(AnsiColor.BLACK, AnsiColor.YELLOW_BACKGROUND);
    public static final LogStyle FILLED_BLUE = new LogStyle(AnsiColor.BLACK, AnsiColor.BLUE_BACKGROUND);
    public static final LogStyle FILLED_PURPLE = new LogStyle(AnsiColor.BLACK, AnsiColor.PURPLE_BACKGROUND);
    public static final LogStyle FILLED_CYAN = new LogStyle(AnsiColor.BLACK, AnsiColor.CYAN_BACKGROUND);
    public static final LogStyle FILLED_WHITE = new LogStyle(AnsiColor.BLACK, AnsiColor.WHITE_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_BLACK = new LogStyle(AnsiColor.WHITE, AnsiColor.BRIGHT_BLACK_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_RED = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_RED_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_GREEN = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_GREEN_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_YELLOW = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_YELLOW_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_BLUE = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_BLUE_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_PURPLE = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_PURPLE_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_CYAN = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_CYAN_BACKGROUND);
    public static final LogStyle FILLED_BRIGHT_WHITE = new LogStyle(AnsiColor.BLACK, AnsiColor.BRIGHT_WHITE_BACKGROUND);
    public static final LogStyle FILLED_GRAY = new LogStyle(AnsiColor.BLACK, AnsiColor.GRAY_BACKGROUND);
    public static final LogStyle FILLED_ORANGE = new LogStyle(AnsiColor.BLACK, AnsiColor.ORANGE_BACKGROUND);
    public static final LogStyle FILLED_PINK = new LogStyle(AnsiColor.BLACK, AnsiColor.PINK_BACKGROUND);
    public static final LogStyle FILLED_CUTE_PINK = new LogStyle(AnsiColor.BLACK, AnsiColor.CUTE_PINK_BACKGROUND);
    public static final LogStyle FILLED_AQUA = new LogStyle(AnsiColor.BLACK, AnsiColor.AQUA_BACKGROUND);
    public static final LogStyle FILLED_GOLD = new LogStyle(AnsiColor.BLACK, AnsiColor.GOLD_BACKGROUND);
    public static final LogStyle FILLED_LIGHT_GREEN = new LogStyle(AnsiColor.BLACK, AnsiColor.LIGHT_GREEN_BACKGROUND);
    public static final LogStyle FILLED_LIGHT_BLUE = new LogStyle(AnsiColor.BLACK, AnsiColor.LIGHT_BLUE_BACKGROUND);
    public static final LogStyle FILLED_MAGENTA = new LogStyle(AnsiColor.BLACK, AnsiColor.MAGENTA_BACKGROUND);
    public static final LogStyle FILLED_LIGHT_CYAN = new LogStyle(AnsiColor.BLACK, AnsiColor.LIGHT_CYAN_BACKGROUND);
    public static final LogStyle FILLED_LIGHT_GRAY = new LogStyle(AnsiColor.BLACK, AnsiColor.LIGHT_GRAY_BACKGROUND);
    public static final LogStyle FILLED_DARK_RED = new LogStyle(AnsiColor.BLACK, AnsiColor.DARK_RED_BACKGROUND);
    public static final LogStyle FILLED_DARK_GREEN = new LogStyle(AnsiColor.WHITE, AnsiColor.DARK_GREEN_BACKGROUND);
    public static final LogStyle FILLED_DARK_BLUE = new LogStyle(AnsiColor.WHITE, AnsiColor.DARK_BLUE_BACKGROUND);
    public static final LogStyle FILLED_DARK_YELLOW = new LogStyle(AnsiColor.WHITE, AnsiColor.DARK_YELLOW_BACKGROUND);
    public static final LogStyle FILLED_DARK_PURPLE = new LogStyle(AnsiColor.BLACK, AnsiColor.DARK_PURPLE_BACKGROUND);
}