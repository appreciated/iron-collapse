package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("iron-collapse-layout")
@HtmlImport("frontend://src/com/github/appreciated/iron-collapse/iron-collapse-layout.html")
public class IronCollapseLayout extends PolymerTemplate<TemplateModel> implements HasComponents {

    @Id("collapse")
    IronCollapse ironCollapse;

    public IronCollapseLayout() {
    }

    public IronCollapseLayout(Component toggle, Component content) {
        add(toggle);
        ironCollapse.add(content);
    }

    public IronCollapse getIronCollapse() {
        return ironCollapse;
    }
}