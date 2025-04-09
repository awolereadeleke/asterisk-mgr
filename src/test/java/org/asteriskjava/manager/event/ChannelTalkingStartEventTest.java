/*
 * Copyright 2004-2022 Asterisk-Java contributors
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
package org.asteriskjava.manager.event;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.asteriskjava.manager.util.EventAttributesHelper.setAttributes;

class ChannelTalkingStartEventTest {
    @Test
    void shouldCreateEvent() {
        //given
        ChannelTalkingStartEvent channelTalkingStartEvent = new ChannelTalkingStartEvent(new Object());

        HashMap<String, Object> attributes = new HashMap<>();
        attributes.put("language", "en");
        attributes.put("accountcode", "");
        attributes.put("context", "phones");
        attributes.put("exten", "5");
        attributes.put("priority", "4");
        attributes.put("uniqueid", "1547252114.0");
        attributes.put("linkedid", "1547252114.0");

        //when
        setAttributes(channelTalkingStartEvent, attributes, new HashSet<>());

        //then
        assertThat(channelTalkingStartEvent.getLanguage()).isEqualTo("en");
        assertThat(channelTalkingStartEvent.getAccountCode()).isEqualTo("");
        assertThat(channelTalkingStartEvent.getContext()).isEqualTo("phones");
        assertThat(channelTalkingStartEvent.getExten()).isEqualTo("5");
        assertThat(channelTalkingStartEvent.getPriority()).isEqualTo(4);
        assertThat(channelTalkingStartEvent.getUniqueId()).isEqualTo("1547252114.0");
        assertThat(channelTalkingStartEvent.getLinkedId()).isEqualTo("1547252114.0");
    }
}
