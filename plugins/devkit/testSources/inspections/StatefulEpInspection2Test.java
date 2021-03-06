// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.idea.devkit.inspections;

import com.intellij.openapi.application.PluginPathManager;
import com.intellij.testFramework.TestDataPath;

@TestDataPath("$CONTENT_ROOT/testData/inspections/statefulEp2")
public class StatefulEpInspection2Test extends StatefulEpInspectionTest {

  @Override
  protected String getBasePath() {
    return PluginPathManager.getPluginHomePathRelative("devkit") + "/testData/inspections/statefulEp2";
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    myFixture.disableInspections(new StatefulEpInspection());
    myFixture.enableInspections(StatefulEpInspection2.class);
  }
}
