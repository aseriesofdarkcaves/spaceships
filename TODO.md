# TODO
- define the end goal of the project (definition of done)
- define smaller goals which help progress towards the project goal

## Phase 1
Overview of phase one is to make a single-player game which will act as a proof-of-concept.
It won't be fun, but it will be a stepping-stone. Whether this is the right approach will be clear enough based on
the progress made...

- Basic 3D ship interior
- One type of ship
- 1st person movement and other controls
  - Define default keybindings (movement, interaction, mouse-look)
  - Keybinding customisation, mouse sensitivity
- 2D GUIs for consoles
  - Every console
    - Map (read-only unless otherwise stated)
    - Shield/hull integrity information
  - Navigation console
    - directional thrusters
    - engine throttle
  - Sensor/weapons console
    - map (see surroundings based on sensors, manage waypoints, fog-of-war)
    - sensors (active/passive scanning based on module installed)
    - targeting and weapons engagement (active target selection, choose and employ weapons)
  - Engineering console
    - shield (uni/multi-directional modes, power-level, frequency-modulation? - works on electromagnetism)
    - ship maintenance (leave console to manage circuit-breakers/fuses etc. - anyone on ship can do this,
      but the overview is in this console)
    - power management
- Map design
  - initially empty
- Systems simulation
  - Power to modules
  - Troubleshooting
- Basic sound effects

## Phase 2
- Multiplayer networking

## Later
- Map content
- AI
- Other ship types
- Economy
