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

	ACCOUNT("mdi-account"), 
	ACCOUNT_BOX("mdi-account-box"), 
	ALERT("mdi-alert"), 
	ALPHA_E_BOX("mdi-alpha-e-box"), 
	ALPHA_L_BOX("mdi-alpha-l-box"),
	ARROW_DOWN_BOX("mdi-arrow-down-box"),
	ARROW_LEFT_BOX("mdi-arrow-left-box"),
	ARROW_RIGHT_BOX("mdi-arrow-right-box"),
	ARROW_UP_BOX("mdi-arrow-up-box"), 
	ARROW_LEFT_BOLD_BOX("mdi-arrow-left-bold-box"),
	ARROW_RIGHT_BOLD_BOX("mdi-arrow-right-bold-box"),
	BRUSH("mdi-brush"),
	CHECK("mdi-check"),
	CHECKBOX_BLANK("mdi-checkbox-blank"),
	CHECKBOX_BLANK_OUTLINE("mdi-checkbox-blank-outline"), 
	CHECK_CIRCLE_OUTLINE("mdi-check-circle-outline"), 
	CHECK_OUTLINE("mdi-check-outline"), 
	CLOSE("mdi-close"), 
	CLOSE_BOX("mdi-close-box"),
	CLOSE_OUTLINE("mdi-close-outline"), 
	CLOSE_CIRCLE_OUTLINE("mdi-close-circle-outline"), 
	DEFAULT(""), 
	DELETE("mdi-delete"), 
	DELETE_OUTLINE("mdi-delete-outline"),
	DELETE_CIRCLE_OUTLINE("mdi-delete-circle-outline"),
	DO_NOT_DISTURB("mdi-do-not-disturb"),
	HOTEL("mdi-hotel"), 
	EYE("mdi-eye"),	EYE_OUTLINE("mdi-eye-outline"), 
	STAR("mdi-star"),
	STAR_OUTLINE("mdi-star-outline"),
	STAR_CIRCLE_OUTLINE("mdi-star-circle-outline"),
	SETTINGS_BOX("mdi-settings-box"),
	SETTINGS_OUTLINE("mdi-settings-outline"),
	WRENCH("mdi-wrench");

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
