package com.me;

public abstract class UIControl {
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public abstract void render();

    public UIControl () {
        this.isEnabled = isEnabled;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
