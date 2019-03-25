package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(addServerSideToggle());
        add(addClientSideToggle());
    }

    private Component addServerSideToggle() {
        Label label = new Label("üpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖH");
        label.setWidth("100%");
        label.getStyle().set("word-wrap", "break-word");
        HorizontalLayout content = new HorizontalLayout(label);
        content.setWidth("300px");
        content.setHeight("300px");
        content.setMargin(true);
        content.getStyle().set("box-shadow", "0 0 5px rgba(0,0,0,0.5)");
        IronCollapse collapse = new IronCollapse(content);
        return new VerticalLayout(new H2("Serverside Toggle"), new Button("Collapse", buttonClickEvent -> collapse.toggle()), collapse);
    }

    private Component addClientSideToggle() {
        Label label = new Label("üpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖH");
        label.setWidth("100%");
        label.getStyle().set("word-wrap", "break-word");
        VerticalLayout content = new VerticalLayout(label, addServerSideToggle());
        content.setWidth("300px");
        content.setMargin(true);
        content.getStyle().set("box-shadow", "0 0 5px rgba(0,0,0,0.5)");
        return new VerticalLayout(new H2("Client Side Toggle"), new IronCollapseLayout(new Button("Collapse"), content));
    }
}
