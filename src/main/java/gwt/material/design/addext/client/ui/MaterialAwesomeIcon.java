/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.addext.client.ui;

import java.util.logging.Logger;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;

import gwt.material.design.addext.client.base.HasAwesomeIcon;
import gwt.material.design.addext.client.ui.constants.AwesomeIconStyle;
import gwt.material.design.addext.client.ui.constants.AwesomeIconType;
import gwt.material.design.client.base.AbstractButton;
import gwt.material.design.client.base.HasSeparator;
import gwt.material.design.client.base.mixin.ColorsMixin;
import gwt.material.design.client.base.mixin.CssNameMixin;
import gwt.material.design.client.base.mixin.ToggleStyleMixin;
import gwt.material.design.client.constants.*;

//@formatter:off

/**
 * We have included 740 Material Design Icons courtesy of Google. You can
 * download them directly from the Material Design specs.
 * <p>
 * <h3>UiBinder Usage:</h3>
 * 
 * <pre>
 * {@code <m:MaterialIcon waves="LIGHT" iconType="POLYMER"/>
 * <m:MaterialIcon waves="LIGHT" iconType="POLYMER" textColor="BLUE" type=
"CIRCLE"/>
 * <m:MaterialIcon waves="LIGHT" iconType="POLYMER" backgroundColor=
"BLUE" textColor="WHITE" type="CIRCLE" tooltip="Tooltip" tooltipLocation=
"BOTTOM"/>}
 * </pre>
 *
 * @author kevzlou7979
 * @author Ben Dol
 * @see <a href="http://www.google.com/design/icons/">Search Google Icons</a>
 * @see <a href=
 *      "http://gwtmaterialdesign.github.io/gwt-material-demo/#icons">Material
 *      Icons Documentation</a>
 * @see <a href="https://material.io/icons/">Material Design Specification</a>
 */
//@formatter:on
public class MaterialAwesomeIcon extends AbstractButton implements HasSeparator, HasAwesomeIcon {
	private static Logger logger = Logger.getLogger(MaterialAwesomeIcon.class.getName());

	private CssNameMixin<MaterialAwesomeIcon, IconPosition> positionMixin;
	private CssNameMixin<MaterialAwesomeIcon, IconSize> sizeMixin;
	private ToggleStyleMixin<MaterialAwesomeIcon> prefixMixin;
	private ColorsMixin<MaterialAwesomeIcon> iconColorMixin;

	private String initClass, iconClass;

	/**
	 * Creates an empty icon.
	 */
	public MaterialAwesomeIcon() {
		super("");
		this.addStyleName(AwesomeIconStyle.SOLID.getCssName());
		initClass = AwesomeIconStyle.SOLID.getCssName();
		logger.info("MaterialAwesomeIcon(" + initClass + ")");
	}

	/**
	 * Sets a simple icon with a given type.
	 */
	public MaterialAwesomeIcon(AwesomeIconType iconType) {
		this();
		logger.info("MaterialAwesomeIcon2()");
		setIconType(iconType);
	}

	/**
	 * Sets an icon with backgroundColor.
	 */
	public MaterialAwesomeIcon(AwesomeIconType iconType, Color bgColor) {
		this(iconType);
		logger.info("MaterialAwesomeIcon3()");
		setBackgroundColor(bgColor);
	}

	/**
	 * Sets an icon with textColor and backgroundColor.
	 */
	public MaterialAwesomeIcon(AwesomeIconType iconType, Color textColor, Color bgColor) {
		this(iconType, bgColor);
		logger.info("MaterialAwesomeIcon4()");
		setTextColor(textColor);
	}

	/**
	 * Sets a simple icon with a given type.
	 */
	public MaterialAwesomeIcon(AwesomeIconStyle iconStyle, AwesomeIconType iconType) {
		super(iconStyle.getCssName());
		logger.info("MaterialAwesomeIcon5()");
		initClass = iconStyle.getCssName();
		setIconType(iconType);
	}

	/**
	 * Sets an icon with backgroundColor.
	 */
	public MaterialAwesomeIcon(AwesomeIconStyle iconStyle, AwesomeIconType iconType, Color bgColor) {
		this(iconStyle, iconType);
		logger.info("MaterialAwesomeIcon6()");
		setBackgroundColor(bgColor);
	}

	/**
	 * Sets an icon with textColor and backgroundColor.
	 */
	public MaterialAwesomeIcon(AwesomeIconStyle iconStyle, AwesomeIconType iconType, Color textColor, Color bgColor) {
		this(iconStyle, iconType, bgColor);
		logger.info("MaterialAwesomeIcon7()");
		setTextColor(textColor);
	}

	public void setInnerText(String innerText) {
		getElement().setInnerText(innerText);
	}

	@Override
	protected Element createElement() {
		return Document.get().createElement("i");
	}

	@Override
	public MaterialAwesomeIcon getIcon() {
		logger.info("MaterialAwesomeIcon().getIcon()");
		return this;
	}

	public AwesomeIconType getIconType() {
		logger.info("MaterialAwesomeIcon().getIconType()");
		return AwesomeIconType.fromStyleName(iconClass);
	}

	@Override
	public void setIconType(AwesomeIconType iconType) {
		logger.info("MaterialAwesomeIcon().setIconType(" + iconType.getCssName() + ")");
		checkIconStyle(iconType);
		logger.info("MaterialAwesomeIcon().setIconType2()->getClassName()=" + getElement().getClassName());
		if ((iconClass != null) && (!iconClass.isEmpty()))
			removeStyleName(iconClass);
		logger.info("MaterialAwesomeIcon().setIconType3()->getClassName()=" + getElement().getClassName());
		addStyleName(iconType.getCssName());
		logger.info("MaterialAwesomeIcon().setIconType4()->getClassName()=" + getElement().getClassName());
		iconClass = iconType.getCssName();
	}

	private void checkIconStyle(AwesomeIconType iconType) {
		logger.info("MaterialAwesomeIcon().checkIconStyle(" + AwesomeIconType.getStyle(iconType).getCssName() + ")");
		if ((initClass != null) && (!initClass.isEmpty())
				&& (!initClass.equals(AwesomeIconType.getStyle(iconType).getCssName()))) {
			logger.info("MaterialAwesomeIcon().checkIconStyle2()->initClass=" + initClass);
			logger.info("MaterialAwesomeIcon().checkIconStyle3()->getClassName()=" + getElement().getClassName());
			removeStyleName(initClass);
			addStyleName(AwesomeIconType.getStyle(iconType).getCssName());
			logger.info("MaterialAwesomeIcon().checkIconStyle4()->getClassName()=" + getElement().getClassName());
			initClass = AwesomeIconType.getStyle(iconType).getCssName();
		}
	}

	@Override
	public void setIconPosition(IconPosition position) {
		getPositionMixin().setCssName(position);
	}

	@Override
	public void setIconSize(IconSize size) {
		getSizeMixin().setCssName(size);
	}

	public IconSize getIconSize() {
		return getSizeMixin().getCssName();
	}

	@Override
	public void setIconColor(Color iconColor) {
		getIconColorMixin().setTextColor(iconColor);
	}

	@Override
	public Color getIconColor() {
		return getIconColorMixin().getTextColor();
	}

	@Override
	public void setIconFontSize(double size, Style.Unit unit) {
		getElement().getStyle().setFontSize(size, unit);
	}

	@Override
	public void setIconPrefix(boolean prefix) {
		getPrefixMixin().setOn(prefix);
	}

	@Override
	public boolean isIconPrefix() {
		return getPrefixMixin().isOn();
	}

	protected CssNameMixin<MaterialAwesomeIcon, IconPosition> getPositionMixin() {
		if (positionMixin == null) {
			positionMixin = new CssNameMixin<>(this);
		}
		return positionMixin;
	}

	protected CssNameMixin<MaterialAwesomeIcon, IconSize> getSizeMixin() {
		if (sizeMixin == null) {
			sizeMixin = new CssNameMixin<>(this);
		}
		return sizeMixin;
	}

	protected ToggleStyleMixin<MaterialAwesomeIcon> getPrefixMixin() {
		if (prefixMixin == null) {
			prefixMixin = new ToggleStyleMixin<>(this, CssName.PREFIX);
		}
		return prefixMixin;
	}

	protected ColorsMixin<MaterialAwesomeIcon> getIconColorMixin() {
		if (iconColorMixin == null) {
			iconColorMixin = new ColorsMixin<>(this);
		}
		return iconColorMixin;
	}
}
