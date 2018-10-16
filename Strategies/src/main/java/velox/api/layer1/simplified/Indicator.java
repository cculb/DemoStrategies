package velox.api.layer1.simplified;

import java.awt.Color;

/**
 * Indicator representing a line.
 */
public interface Indicator {
    /**
     * Set new line Y coordinate in indicator coordinates space. {@link Double#NaN}
     * to stop drawing (can be imagined as switching to invisible color)
     *
     * @param value
     *            new value
     */
    void addPoint(double value);
    
    /**
     * Set new line color. Applied immediately.
     *
     * @param color
     *            new line color
     */
    void setColor(Color color);

    /**
     * Set new line width. Applied immediately.
     *
     * @param width
     *            width in pixels
     */
    void setWidth(int width);

    /**
     * Set new line style. Applied immediately.
     *
     * @param lineStyle
     *            new line style
     */
    void setLineStyle(LineStyle lineStyle);
}
