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

import java.util.logging.Logger;

import com.google.gwt.dom.client.Style.Unit;

import gwt.material.design.addext.client.base.HasAwesomeIcon;
import gwt.material.design.addext.client.ui.constants.AwesomeIconType;
import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;

/**
 * @author robi
 *
 */
public class MaterialAutoCompleteAdd extends MaterialAutoComplete implements HasAwesomeIcon {
	private static Logger logger = Logger.getLogger(MaterialAutoCompleteAdd.class.getName());

	private MaterialAwesomeIcon icon = new MaterialAwesomeIcon();

	public MaterialAutoCompleteAdd() {
		super();
	}

	@Override
	public MaterialAwesomeIcon getIcon() {
		return icon;
	}

	@Override
	public void setIconType(AwesomeIconType iconType) {
		logger.info("setIconType");
		icon.setIconType(iconType);
		icon.setIconPrefix(true);
		insert(icon, 0);
		this.getChildrenList().get(1).getElement().getStyle().setPaddingLeft(44, Unit.PX);
		this.getLabel().getElement().getStyle().setPaddingLeft(44, Unit.PX);
	}

	@Override
	public void setIconPosition(IconPosition position) {
		icon.setIconPosition(position);
	}

	@Override
	public void setIconSize(IconSize size) {
		icon.setIconSize(size);
	}

	@Override
	public void setIconFontSize(double size, Unit unit) {
		icon.setIconFontSize(size, unit);
	}

	@Override
	public void setIconColor(Color iconColor) {
		icon.setIconColor(iconColor);
	}

	@Override
	public Color getIconColor() {
		return icon.getIconColor();
	}

	@Override
	public void setIconPrefix(boolean prefix) {
		icon.setIconPrefix(prefix);
	}

	@Override
	public boolean isIconPrefix() {
		return icon.isIconPrefix();
	}

}
