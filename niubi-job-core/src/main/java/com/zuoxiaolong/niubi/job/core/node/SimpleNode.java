/*
 * Copyright 2002-2016 the original author or authors.
 *
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
 */

package com.zuoxiaolong.niubi.job.core.node;

import com.zuoxiaolong.niubi.job.core.config.Configuration;

/**
 * 单机版实现
 *
 * @author Xiaolong Zuo
 * @since 16/1/12 01:17
 */
public class SimpleNode extends AbstractNode {

    public SimpleNode() {
        this(new Configuration());
    }

    public SimpleNode(Configuration configuration) {
        super(configuration);
    }

    public void join() {
        getContainer().getScheduleManager().startup();
    }

    public void exit() {
        getContainer().getScheduleManager().shutdown();
    }

}
