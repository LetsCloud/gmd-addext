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
package gwt.material.design.addext.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import gwt.material.design.addext.client.StartupState.DebugState;

public class MaterialAddext implements EntryPoint {

    private static StartupState startupState;

    @Override
    public void onModuleLoad() {
        // Initialize the startup state.
        checkStartupState();
    }

    private static void checkStartupState() {
        if (startupState == null) {
            startupState = GWT.create(StartupState.class);
        }
    }

    public static StartupState getStartupState() {
        checkStartupState();
        return startupState;
    }

    public static boolean isDebug() {
        return MaterialAddext.getStartupState() instanceof DebugState;
    }
}
