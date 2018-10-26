export default [
  {
    buttons: [
      {
        id: "leftmenu-1",
        icon: "menu",
        action: "leftmenuEvent"
      }
    ]
  },
  {
    tabs: [
      {
        id: "tab-1",
        disable: false,
        alert: true,
        image: "statics/logo/dark.png",
        "class-text": "capitalize",
        to: "/",
        action: "tabHomeEvent",
        text: "toolbar.tabs.tab-home"
      }
    ]
  },
  {
    id: "title",
    title: true,
    text: ""
  },
  {
    buttons: [
      {
        id: "rightmenu-1",
        icon: "contact_mail",
        action: "rightmenuEvent"
      }
    ]
  }
];
