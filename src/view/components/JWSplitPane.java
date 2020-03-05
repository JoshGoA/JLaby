package src.view.components;

import java.awt.Component;

import javax.swing.JSplitPane;

/**
 * An extended <code>javax.swing.JSplitPane</code> implementation.
 *
 * @see javax.swing.JSplitPane JSplitPane
 */
public final class JWSplitPane extends JSplitPane {

    private static final long serialVersionUID = 1L;

    /**
     * Enclose newOrientation, Component and enabled.
     *
     * @param newOrientation    int
     * @param newLeftComponent  Component
     * @param newRightComponent Component
     * @param enabled           boolean
     */
    public JWSplitPane(final int newOrientation, final Component newLeftComponent, final Component newRightComponent,
            final boolean enabled) {
        super(newOrientation, newLeftComponent, newRightComponent);
        this.setEnabled(enabled);
        this.setOneTouchExpandable(enabled);
        this.setDividerLocation(-1);
    }

}
