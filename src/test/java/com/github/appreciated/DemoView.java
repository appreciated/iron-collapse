package com.github.appreciated;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        addServerSideToggle();
        addClientSideToggle();
    }

    private void addServerSideToggle() {
        Label label = new Label("üpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖH");
        label.setWidth("100%");
        label.getStyle().set("word-wrap", "break-word");
        HorizontalLayout content = new HorizontalLayout(label);
        content.setWidth("300px");
        content.setHeight("300px");
        content.setMargin(true);
        content.getStyle().set("box-shadow", "0 0 5px rgba(0,0,0,0.5)");
        IronCollapse collapse = new IronCollapse(content);
        add(new H2("Serverside Toggle"), new Button("Collapse", buttonClickEvent -> collapse.toggle()), collapse);
    }

    private void addClientSideToggle() {
        Label label = new Label("üpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖHüpasidfjgkljasdklfgjklsjdfklgöjKLSHDFÖH");
        label.setWidth("100%");
        label.getStyle().set("word-wrap", "break-word");
        HorizontalLayout content = new HorizontalLayout(label);
        content.setWidth("300px");
        content.setHeight("300px");
        content.setMargin(true);
        content.getStyle().set("box-shadow", "0 0 5px rgba(0,0,0,0.5)");
        add(new H2("Client Side Toggle"), new IronCollapseLayout(new Button("Collapse"), content));
    }
}
