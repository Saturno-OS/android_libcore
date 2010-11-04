/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.api.javax.xml.parsers;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package tests.api.javax.xml.parsers;
 */

public class AllTests {
    public static Test suite() {
        TestSuite suite = new TestSuite("All tests for package tests.api.javax.xml.parsers;");
        // $JUnit-BEGIN$

        suite.addTestSuite(DocumentBuilderFactoryTest.class);
        suite.addTestSuite(DocumentBuilderTest.class);
        suite.addTestSuite(FactoryConfigurationErrorTest.class);
        suite.addTestSuite(ParserConfigurationExceptionTest.class);
        suite.addTestSuite(SAXParserFactoryTest.class);
        suite.addTestSuite(SAXParserTest.class);

        // $JUnit-END$
        return suite;
    }
}
