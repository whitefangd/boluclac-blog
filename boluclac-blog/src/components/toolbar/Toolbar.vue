<template>
  <q-toolbar>
    <template v-for="(menu, index) in menus" >
      <template v-if="menu.buttons">
        <q-btn
          v-for="button in menu.buttons"
          :key="button.id"
          :icon="button.icon"
          flat
          dense
          round
          @click="action($event, button.action)" />
      </template>
      <q-tabs
        v-else-if="menu.tabs"
        :key="'tabs-' +index" >
        <template v-for="tab in menu.tabs" >
          <q-route-tab
            v-if="tab.to"
            slot="title"
            :key="tab.id"
            :icon="tab.icon"
            :to="tab.to"
            :disable="tab.disable"
            :alert="tab.alert"
            exact
            @click="action($event, tab.action)" >
            <span>
              <img
                v-if="tab.image"
                :src="tab.image"
                class="q-mr-sm logo vertical-middle">
              <span :class="tab['class-text']">{{ $t(tab.text) }}</span>
            </span>
          </q-route-tab>
          <q-tab
            v-else
            slot="title"
            :key="tab.id"
            :icon="tab.icon"
            :disable="tab.disable"
            :alert="tab.alert"
            exact
            @click="action($event, tab.action)" >
            <span>
              <img
                v-if="tab.image"
                :src="tab.image"
                class="q-mr-sm logo vertical-middle">
              <span :class="tab['class-text']">{{ $t(tab.text) }}</span>
            </span>
          </q-tab>
        </template>
      </q-tabs>
      <q-toolbar-title
        v-else-if="menu.title"
        :key="menu.id">
        {{ $t(menu.text) }}
      </q-toolbar-title>
    </template>
  </q-toolbar>
</template>
<script>
export default {
  name: "Toolbar",
  props: {
    menus: {
      type: Array,
      required: true,
      default: undefined
    }
  },
  watch: {
    menus(newValue, oldValue) {
      if (newValue != oldValue) {
        this.menus = newValue;
      }
    }
  },
  methods: {
    action($event, action) {
      this.$emit("action", action);
    }
  }
};
</script>
