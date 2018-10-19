<template>
  <!-- main wrapping component -->
  <q-layout class="bg-blue-grey-4">
    <!-- optional -->
    <q-layout-header>
      <!-- content; any -->
      <toolbar
        :menus="toolbarMenu"
        @action="toolbarEvent"
        @click-menu="leftDrawerOpen = !leftDrawerOpen" />
    </q-layout-header>
    <!-- optional -->
    <q-layout-drawer
      v-model="leftDrawerOpen"
      side="left">
      <side-bar :menus="menus" />
      <!-- content; any -->
    </q-layout-drawer>
    <!-- optional -->
    <q-layout-drawer
      v-model="rightDrawerOpen"
      side="right">
      <profile :account="account" />
      <!-- content; any -->
    </q-layout-drawer>
    <!-- REQUIRED -->
    <q-page-container>
      <router-view />
    </q-page-container>
    <!-- optional -->
    <q-layout-footer>
      <!-- content; any -->
    </q-layout-footer>
  </q-layout>
</template>

<script>
import { openURL } from "quasar";
import menus from "@/menus/LeftMenu";
import toolbarMenu from "@/menus/ToolbarMenu";
import { SideBar, Toolbar, Profile } from "@/components";

export default {
  name: "MainLayout",
  components: { SideBar, Toolbar, Profile },
  data() {
    return {
      account: {
        name: "Bò Lúc Lắc",
        mail: "boluclac.mamnem@gmail.com",
        locale: "vi"
      },
      menus: menus,
      toolbarMenu: toolbarMenu,
      leftDrawerOpen: this.$q.platform.is.desktop,
      rightDrawerOpen: false
    };
  },
  methods: {
    openURL,
    toolbarEvent(action) {
      if (action == "leftmenuEvent") {
        this.leftDrawerOpen = !this.leftDrawerOpen;
      } else if (action == "rightmenuEvent") {
        this.rightDrawerOpen = !this.rightDrawerOpen;
      }
    }
  }
};
</script>

<style>
</style>
