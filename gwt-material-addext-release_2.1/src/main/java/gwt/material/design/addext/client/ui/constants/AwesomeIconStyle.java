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
public enum AwesomeIconStyle implements CssType {

	REGULAR("fa"), SOLID("fas"), BRAND("fab");

	private final String cssClass;

	AwesomeIconStyle(final String cssClass) {
		this.cssClass = cssClass;
	}

	@Override
	public String getCssName() {
		return cssClass;
	}

	public static AwesomeIconStyle fromStyleName(final String styleName) {
		return EnumHelper.fromStyleName(styleName, AwesomeIconStyle.class, REGULAR);
	}

}
