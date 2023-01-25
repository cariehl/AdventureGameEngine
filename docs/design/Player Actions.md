# Standard Player Actions

These are the actions that are always or commonly available to the player. They are listed by the **help** action.

## help

Display the list of standard player actions.

```
> help

Standard actions:

help
	Display this list of standard actions.

look
(alias: examine)
	Examine the current room.
	Optionally, takes one of the following parameters:
		{item} - examine the given item in the inventory or current room.
		{entity} - examine the given entity in the current room.
		{cardinalDirection} - examine what lies in the given cardinal direction from the current room.

go {cardinalDirection}
(alias: move)
	Move in a cardinal direction, if possible.

inventory
	Display a list of items in the inventory.

equipment
	Display a list of equipped items.

take {item}
(alias: pickup, grab)
	Pick up an item from the current room and add it to the inventory.

drop {item}
	Remove an item from the inventory and place it in the current room.

interact
	Attempt to interact with something in the environment. If more than one interaction is possible, a list of available interactions is displayed. NOTE: some interactions are secret! Just because it's missing from the list of available interactions doesn't mean it is impossible.
	Requires one of the following parameters:
		{item} - interact with the given item in the inventory or current room.
		{entity} - interact with the given entity in the current room.

use {item} on
	Attempt to use an item from the inventory on something in the environment.
	Requires one of the following parameters:
	{item2} - attempt to use the given first item with the given second item in the inventory or current room.
	{entity} - attempt to use the given item with the given entity in the current room.
```





## look

Alias: **examine**

Gather information about something in the world.



#### look

Displays information about the current room. This is the same description that is shown when entering a new room for the first time.

```
> look

**Cooper's Castle - Entrance Foyer**

You are standing in a large entrance foyer. To the south, there are two double doors. There are corridors leading to the north, east, and west.

There is a **mysterious note** on the ground.
There is a **bronze sword** hanging on the wall.

There is an **ominous bird** standing on a perch.
```



#### look {item}

Displays information about an item in the inventory or current room. This includes the name of the item and a short description of what it is/does.

```
> look mysterious note # or "look note" or "look mysterious"

**mysterious note**

You found this note on the floor of the entrance foyer. You wonder where it came from.

Possible interactions:
- read
```



#### look {entity}

Displays information about the given entity in the current room. This includes the name and a short description of the entity. If currently in combat with the entity, the known combat stats are also displayed.

```
> look ominous bird # or "look bird"

**ominous bird**

This black-feathered bird is perched on a carved wooden stand. It watches you constantly as you move about the room.

Possible interactions:
- talk
- fight
```

```
> look goblin

**goblin warrior** (4 hp)

This goblin is covered in warts, and looks angry. It is about as tall as your waist.

It is wearing **rusty chain mail** and wields a **beaten-up morningstar**.
```



#### look {cardinalDirection}

Displays information about whatever is in the given direction. If there is a blockage, it is described. If there is a passageway, it is described. If the passageway leads to a visited room, the room title is included.

```
> look east

There is a passageway to the east, leading to the **Kitchen**.
```

```
> look north

There is a passageway to the north, leading into the unknown.
```

```
> look south

There are two double doors to the south. They are currently closed.
```



## go

Alias: **move**

Move in a direction.



#### go {cardinalDirection}

Move to the room in the given direction, if possible.

```
> go east

**Cooper's Castle - Kitchen**
```

```
> go north

**Cooper's Castle - Entry Hall**

You are standing in a long hallway, lined with large paintings of kings and queens. Their displeased faces loom down at you, and their eyes seem to follow you as you move around the hall.

There is a **keypad** on the wall.
There is a **lever** on the wall.
```

```
> go south

The doors are locked.
```



## inventory

Display a list of items in the inventory.

```
> inventory

You are carrying the following:
- mysterious note
```



## equipment

Display a list of equipped items.

```
> equipment

You have the following equipped:
- bronze short sword
- torch
```



## take

Alias: **pickup**

Take an item from the current room and add it to the inventory.



#### take {item}

Take the given item from the current room and add it to the inventory.

```
> take note

Added a **mysterious note** to the inventory.
```



## drop

Remove an item from the inventory and leave it in the current room.



#### drop {item}

Remove the given item from the inventory and leave it in the current room.

```
> drop note

Dropped a **mysterious note**.
```



## interact

Interact with something in the environment. If the target has only a single interaction, it will automatically be used. Otherwise, a list of available interactions will be shown.



#### interact {item}

Interact with the given item in the inventory or current room.

```
> interact note

(read mysterious note)

A steady hand scrawled this message onto fine parchment with a quill and ink:

"Welcome to my castle, adventurer! If you can find a way to unlock the front doors, I'll let you leave with any treasure you happen to find here. But beware, traps and hazards lie around every corner! And then there's the dragon..."
```



#### interact {entity}

Interact with the given entity in the current room.

```
> interact bird

What would you like to do with the ominous bird?
- talk
- fight
- cancel

> 
```

```
> interact lever

(pull lever)

You pull down on the lever. Nothing seems to happen...
```



## use

Attempt to use an item from the inventory with something in the environment. If an interaction is available between the two targets, it occurs. Otherwise, nothing interesting happens.



#### use {item} on {item}

Use the first item from the inventory on the second item in the inventory or current room.

```
> use note on torch

You burn the **mysterious note** to ashes.
```



#### use {item} on {entity}

Use the given item from the inventory on the given entity in the current room.

```
> use torch on bird

You swing the **torch** at the **ominous bird**, but it swiftly dodges the flames. The bird glares at you as it returns to its perch.
```

```
> use note on bird

You hold the **mysterious note** up to the **ominous bird**. It cocks its head at you. You remember that birds cannot read.
```

```
> use platebody on bird

You attempt to use the **bronze platebody** on the **ominous bird**.
Nothing interesting happens.
```



# Combat Actions

Some actions are only available when the adventurer is in combat with a foe.



# Context-dependent Actions

Some rooms, items, entities, etc. will offer special actions. 