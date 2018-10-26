import Vue from "vue";
import Vuex from "vuex";

import languages from "./languages";
import account from "./account";
import config from "./config";

Vue.use(Vuex);

/*
 * If not building with SSR mode, you can
 * directly export the Store instantiation
 */

export default function(/* { ssrContext } */) {
  const Store = new Vuex.Store({
    modules: {
      languages,
      account,
      config
    }
  });

  return Store;
}
