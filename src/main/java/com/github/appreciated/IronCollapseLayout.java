package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("iron-collapse-layout")
@NpmPackage(value = "@polymer/iron-collapse", version = "3.0.1")
@JsModule("./com/github/appreciated/iron-collapse/iron-collapse-layout.js")
public class IronCollapseLayout extends PolymerTemplate<TemplateModel> implements HasComponents, HasSize {

    @Id("collapse")
    IronCollapse ironCollapse;

    @Id("toggle")
    Div div;

    public IronCollapseLayout() {
    }

    public IronCollapseLayout(Component toggle, Component content) {
        add(toggle);
        addCollapsibleContent(content);
    }

    public void addCollapsibleContent(Component component) {
        add(component);
        component.getElement().setAttribute("slot", "collapsible");
    }

    public void setInlineBlockMode(boolean enable) {
        getDiv().getStyle().set("display", "inline-block");
    }

    public Div getDiv() {
        return div;
    }

    public IronCollapse getIronCollapse() {
        return ironCollapse;
    }
}