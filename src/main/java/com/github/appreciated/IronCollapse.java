package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("iron-collapse")
@NpmPackage(value = "@polymer/iron-collapse", version = "3.0.1")
@JsModule("@polymer/iron-collapse/iron-collapse.js")
public class IronCollapse extends Component implements HasSize, HasComponents {

    public IronCollapse(Component content) {
        this();
        add(content);
    }

    public IronCollapse() {
        this.getElement().getStyle().set("margin", "unset");
    }

    public void toggle() {
        getElement().callJsFunction("toggle");
    }

    public void show() {
        getElement().callJsFunction("show");
    }

    public void hide() {
        getElement().callJsFunction("hide");
    }

    public void updateSize(String size, boolean animated) {
        getElement().callJsFunction("updateSize", animated);
    }

    public boolean getHorizontal() {
        return getElement().getProperty("horizontal", false);
    }

    public void setHorizontal(boolean horizontal) {
        getElement().setProperty("horizontal", horizontal);
    }

    public boolean getNoAnimation() {
        return getElement().getProperty("noAnimation", false);
    }

    public void setNoAnimation(boolean noAnimation) {
        getElement().setProperty("noAnimation", noAnimation);
    }

    public boolean getOpened() {
        return getElement().getProperty("opened", false);
    }

    public void setOpened(boolean opened) {
        getElement().setProperty("opened", opened);
    }

}