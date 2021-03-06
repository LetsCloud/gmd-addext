/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.addext.client.base;

import com.google.gwt.dom.client.Style;

import gwt.material.design.addext.client.ui.MaterialDesignIcon;
import gwt.material.design.addext.client.ui.constants.MdiType;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;

/**
 * @author robi
 *
 */
public interface HasMdi {

    /**
     * Get the icon widget.
     */
    MaterialDesignIcon getIcon();

    /**
     * Set Material Design icon.
     * @see <a href="//www.google.com/design/icons/">Material Design Icons</a>
     */
    void setIconType(MdiType iconType);

    /**
     * Set the position of the icon.
     */
    void setIconPosition(IconPosition position);

    /**
     * Size of icon.
     */
    void setIconSize(IconSize size);

    /**
     * Set the font size of the icon.
     */
    void setIconFontSize(double size, Style.Unit unit);

    /**
     * Sets the color of the icon.
     */
    void setIconColor(Color iconColor);

    /**
     * Get the color of the icon
     */
    Color getIconColor();

    /**
     * Make the icon prefix in its container.
     */
    void setIconPrefix(boolean prefix);

    /**
     * Is the icon prefix in the container.
     */
    boolean isIconPrefix();
}
