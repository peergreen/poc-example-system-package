/**
 * Copyright 2013 Peergreen S.A.S.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.peergreen.test.hiddenpackage;

import java.io.IOException;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Validate;

@Component
@Instantiate
public class TestPackage {


    @SuppressWarnings("restriction")
    @Validate
    public void start() throws IOException {
        sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
        String encoded = encoder.encode("toto".getBytes());

        System.out.println("encoded value = " + encoded);

        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        byte[] decoded = decoder.decodeBuffer(encoded);

        System.out.println("decoded encoded = " + new String(decoded));

    }



}
