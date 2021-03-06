/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package Nani;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * The Spring-boot main class.
 */
@SpringBootApplication
@ImportResource({"classpath:spring/amq.xml", "classpath:spring/camel-context.xml"})
public class Application extends FatJarRouter {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        FatJarRouter.main(args);
    }

}
