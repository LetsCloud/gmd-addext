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

import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import gwt.material.design.addins.client.timepicker.MaterialTimePicker;
import gwt.material.design.client.ui.MaterialPanel;

/**
 * @author robi
 *
 */
public class MaterialTimePickerFixed extends MaterialTimePicker {

	@Override
	protected void onLoad() {
		super.onLoad();
		final MaterialTimePicker dp = this;
		this.getElement().getStyle().setPosition(Position.RELATIVE);
		MaterialPanel p = new MaterialPanel();
		p.getElement().getStyle().setPosition(Position.ABSOLUTE);
		p.getElement().getStyle().setZIndex(100);
		p.setHeight("50px");
		p.setWidth("100%");
		p.getElement().getStyle().setTop(0, Unit.PX);
		p.getElement().getStyle().setCursor(Cursor.POINTER);
		p.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				dp.open();
			}
		});
		this.add(p);
	}

}
