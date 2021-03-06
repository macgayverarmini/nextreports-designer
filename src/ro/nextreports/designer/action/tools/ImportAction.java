/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.designer.action.tools;


import javax.swing.*;

import ro.nextreports.designer.util.I18NSupport;
import ro.nextreports.designer.util.ImageUtil;
import ro.nextreports.designer.wizimport.ImportWizard;

import java.awt.event.ActionEvent;

/**
 * Created by IntelliJ IDEA.
 * User: mihai.panaitescu
 * Date: 16-Mar-2009
 * Time: 15:03:17
 */
public class ImportAction extends AbstractAction {

    public ImportAction() {
        putValue(Action.NAME, I18NSupport.getString("import"));
        putValue(Action.SMALL_ICON, ImageUtil.getImageIcon("import"));
        putValue(Action.MNEMONIC_KEY, new Integer('I'));
//        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_B,
//                KeyEvent.CTRL_DOWN_MASK));
        putValue(Action.SHORT_DESCRIPTION, I18NSupport.getString("import.short.desc"));
        putValue(Action.LONG_DESCRIPTION, I18NSupport.getString("import.long.desc"));
    }

    public void actionPerformed(ActionEvent ev) {
        new ImportWizard();
    }

}
