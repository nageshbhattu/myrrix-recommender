/*
 * Copyright Myrrix Ltd
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

package net.myrrix.client;

import org.junit.Test;

import net.myrrix.common.LangUtils;

public final class RepeatedFoldInTest extends AbstractClientTest {

  @Override
  protected String getTestDataPath() {
    return "testdata/grouplens100K-45";
  }

  @Test
  public void testWaitForBuild() throws Exception {
    ClientRecommender client = getClient();
    for (int i = 0; i < 10000; i++) {
      client.setPreference(i % 5, i % 3, 100.0f);
    }
    assertTrue(LangUtils.isFinite(client.estimatePreference(0, 0)));
    assertTrue(LangUtils.isFinite(client.estimatePreference(0, 1)));
    assertEquals(5, client.recommend(1, 5).size());
    client.refresh(null);
    assertTrue(LangUtils.isFinite(client.estimatePreference(0, 0)));
    assertTrue(LangUtils.isFinite(client.estimatePreference(0, 1)));
    assertEquals(5, client.recommend(1, 5).size());
  }

}
