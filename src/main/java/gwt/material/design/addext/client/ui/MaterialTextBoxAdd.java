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
package gwt.material.design.addext.client.ui;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;

import gwt.material.design.addext.client.ui.constants.AwesomeIconType;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.ui.MaterialTextBox;

/**
 * @author robi
 *
 */
public class MaterialTextBoxAdd extends MaterialTextBox {

	private MaterialAwesomeIcon rightIcon = new MaterialAwesomeIcon();

	public MaterialTextBoxAdd() {
		super();
	}

	public MaterialAwesomeIcon getRightIcon() {
		return rightIcon;
	}

	public void setRightIconType(AwesomeIconType iconType) {
		rightIcon.setIconType(iconType);
		rightIcon.setLayoutPosition(Position.ABSOLUTE);
		rightIcon.setTop(0);
		rightIcon.setRight(0);
		rightIcon.setMarginRight(5);
		add(rightIcon);
//		this.getChildrenList().get(0).getElement().getStyle().setPaddingRight(44, Unit.PX);
	}

	public void setRightIconPosition(IconPosition position) {
		rightIcon.setIconPosition(position);
	}

	public void setRightIconSize(IconSize size) {
		rightIcon.setIconSize(size);
	}

	public void setRightIconFontSize(double size, Unit unit) {
		rightIcon.setIconFontSize(size, unit);
	}

	public void setRightIconColor(Color iconColor) {
		rightIcon.setIconColor(iconColor);
	}

	public Color getRightIconColor() {
		return rightIcon.getIconColor();
	}

	public void setRightIconPrefix(boolean prefix) {
		rightIcon.setIconPrefix(prefix);
	}

	public boolean isRightIconPrefix() {
		return rightIcon.isIconPrefix();
	}

}
