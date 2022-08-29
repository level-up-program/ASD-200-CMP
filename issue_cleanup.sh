#!/bin/bash
for i in $(seq 7 105)
do
   gh issue delete $i -R github.com/level-up-program/ASD-200-CMP --confirm
done
