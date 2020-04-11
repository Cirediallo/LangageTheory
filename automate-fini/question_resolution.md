# Finite Automaton

![AFD transition table]("C:\Users\satsuroki\Pictures\AFD.png" "AFD transition table")


![AFD Automaton Representation]("C:\Users\satsuroki\Documents\UCA\2019-2020\S6\Théorie Langage\resolution-tp\automate-fini\img\AFD.png" "AFD Representaion")

# Nondeterministic finite Automaton (NFA)

## AFN1


![AFN Automaton Representation]("C:\Users\satsuroki\Documents\UCA\2019-2020\S6\Théorie Langage\resolution-tp\automate-fini\img\afn1.png" "AFN1 Representaion")

> Pourquoi l'automate A n'est pas déterministe ?

L'automate non deterministe A representé par le fichier afn1.jff est non deterministe puisque à l'état 0 par la transition ***b*** l'automate ne sait s'il doit aller à l'état *q1* ou rester dans le même état (à savoir *q0* )

> Donner la trace des deux calculs acceptant de l'automate A sur cette entrée

#### Trace 1: ->q0 ->(a)q2 ->(a)q3 ->(b)q3 ->(b)q3

#### Trace 2: ->q0 ->(a)q0 ->(a)q0 ->(b)q1 ->(b)q3 

> Words with length == 2 which are(will be) rejected by the automaton

1. aa
1. ab
1. ba
1. bb

> Construire un automate fini déterministe équivalent à l'automate non deterministe A

![AFN1 Automaton Convert to an AFD Representation]("C:\Users\satsuroki\Documents\UCA\2019-2020\S6\Théorie Langage\resolution-tp\automate-fini\img\afn1_convert_to_afd.png" "AFN1 Automaton Convert to an AFD Representaion")

# Finite Automaton to Regex


