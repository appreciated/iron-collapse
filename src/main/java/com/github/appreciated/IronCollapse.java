package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;

@Tag("iron-collapse")
@HtmlImport("bower_components/iron-collapse/iron-collapse.html")
public class IronCollapse extends Component {

    public IronCollapse(Component content) {
        getElement().appendChild(content.getElement());
    }

    public void toggle() {
        getElement().callFunction("toggle");
    }

    public void show() {
        getElement().callFunction("show");
    }

    public void hide() {
        getElement().callFunction("hide");
    }

    public void updateSize(String size, boolean animated) {
        getElement().callFunction("updateSize", animated);
    }

    public void setHorizontal(boolean horizontal) {
        getElement().setProperty("horizontal", horizontal);
    }

    public boolean getHorizontal() {
        return getElement().getProperty("horizontal", false);
    }

    public void setNoAnimation(boolean noAnimation) {
        getElement().setProperty("noAnimation", noAnimation);
    }

    public boolean getNoAnimation() {
        return getElement().getProperty("noAnimation", false);
    }

    public void setOpened(boolean opened) {
        getElement().setProperty("opened", opened);
    }

    public boolean getOpened() {
        return getElement().getProperty("opened", false);
    }

}