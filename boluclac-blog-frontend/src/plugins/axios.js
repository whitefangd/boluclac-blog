import axios from "axios";
import constant from "@/common/const";

const querystring = require("querystring");

const URL = constant.URL;

export default ({ Vue }) => {
  Vue.prototype.$axios = axios;
  Vue.mixin({
    methods: {
      axiosHttpGet(url, data) {
        var params = "";
        if (data) {
          params = "?" + querystring.stringify(data);
        }
        var requestUrl = url + params;
        return this.$axios.get(URL.BASE + requestUrl);
      },
      axiosHttpPost(url, data) {
        return this.$axios.post(URL.BASE + url, data);
      },
      axiosHttpPut(url, data) {
        return this.$axios.put(URL.BASE + url, data);
      },
      axiosHttpDelete(url, data) {
        var params = "";
        if (data) {
          params = "?" + querystring.stringify(data);
        }
        var requestUrl = url + params;
        return this.$axios.delete(URL.BASE + requestUrl);
      }
    }
  });
};
