/*
 * Copyright 2018 "JackWhite20"
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

package net.jackwhite20.slug.ast;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberNodeTest {

    private static final int VALUE = 41;

    @Test
    public void testNumberNode() {
        NumberNode numberNode = new NumberNode(String.valueOf(VALUE));

        assertEquals(VALUE, numberNode.getValue());
    }
}