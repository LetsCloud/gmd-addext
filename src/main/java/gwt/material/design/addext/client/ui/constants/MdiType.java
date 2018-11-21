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
package gwt.material.design.addext.client.ui.constants;

import gwt.material.design.client.base.helper.EnumHelper;
import gwt.material.design.client.constants.CssType;

/**
 * @author robi
 *
 */
public enum MdiType implements CssType {

	DEFAULT(""), DELETE_CIRCLE_OUTLINE("mdi-delete-circle-outline"), ACCOUNT("mdi-account"), BRUSH("mdi-brush"),
	WRENCH("mdi-wrench"), ARROW_UP_BOX("mdi-arrow-up-box"), ARROW_DOWN_BOX("mdi-arrow-down-box"),
	EYE_OUTLINE("mdi-eye-outline"), SETTINGS_OUTLINE("mdi-settings-outline"),
	CHECK_CIRCLE_OUTLINE("mdi-check-circle-outline"), STAR_CIRCLE_OUTLINE("mdi-star-circle-outline"),
	CLOSE_CIRCLE_OUTLINE("mdi-close-circle-outline"), ALPHA_E_BOX("mdi-alpha-e-box"), ALPHA_L_BOX("mdi-alpha-l-box"),
	ACCOUNT_BOX("mdi-account-box"), SETTING_BOX("mdi-setting-box"), EYE("mdi-eye"), CLOSE_BOX("mdi-close-box"),
	CHECKBOX_BLANK("mdi-checkbox-blank");

	private final String cssClass;

	MdiType(final String cssClass) {
		this.cssClass = cssClass;
	}

	@Override
	public String getCssName() {
		return cssClass;
	}

	public static MdiType fromStyleName(final String styleName) {
		return EnumHelper.fromStyleName(styleName, MdiType.class, DEFAULT);
	}
}
