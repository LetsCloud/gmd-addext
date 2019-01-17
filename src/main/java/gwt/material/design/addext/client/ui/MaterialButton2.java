/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2019 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * 
 */
package gwt.material.design.addext.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

import gwt.material.design.addext.client.base.AbstractIconButton2;
import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialIcon;

/**
 * @author CR
 *
 */
public class MaterialButton2 extends AbstractIconButton2 {

    public MaterialButton2() {
        super(ButtonType.RAISED);
    }

    public MaterialButton2(String text) {
        this();
        setText(text);
    }

    public MaterialButton2(String text, IconType icon) {
        this(text);
        setIconType(icon);
    }

    public MaterialButton2(ButtonType type) {
        super(type);
    }

    public MaterialButton2(String text, IconType icon, ButtonType type) {
        this(text, icon);
        setType(type);
    }

    public MaterialButton2(String text, ButtonType type, MaterialIcon icon) {
        super(type, text, icon);
    }

    public MaterialButton2(String text, IconType icon, ButtonType type, Color bgColor, Color textColor) {
        this(text, icon, type);
        setBackgroundColor(bgColor);
        setTextColor(textColor);
    }

    @Override
    protected Element createElement() {
        return Document.get().createPushButtonElement();
    }
}