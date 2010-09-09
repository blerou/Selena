package com.Selena.uielements;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Web Element object.
 *
 * @author Brautigam Gergely
 *
 */
@Root(name = "WebElement")
public class WebElement
{

    @Element(name = "Locators")
    public Locators locators;

    /**
     * <WebElement name="xy"/>
     */
    @Attribute(name="name", required=false)
    public String name;
}

