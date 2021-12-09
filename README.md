# DesignPatterns
Library of design patterns

## Gang of four patterns
### Behavioral
### Creational
#### Singleton
Návrhový vzor singleton patří do základní výbavy každého programátora. Jeho podstatou je vytvoření pouze jedné instance bezestavového objektu, která se používá napříč celou aplikací. Díky tomu, že je značná část tříd z principu bezestavová (data access objecty, service objekty atp.), se dá tímto způsobem ušetřit značné množství paměti.
#### Object pool
Návrhový vzor Object pool (Fond) použijeme, potřebujeme-li omezit počet vytvářených instancí, jejichž výroba je časově náročná, ale nepotřebujeme jich mnoho najednou. Pool upřednostňuje recyklaci (znovuvyužití) objektů před konstrukcí nových instancí.
Jádrem vzoru je samotná třída fondu, která zajišťuje vydávání a uchovávání instancí. Potřebuje-li aplikace instanci daného typu, obratí se na fond a ten jí tuto instanci propůjčí. V okamžiku, kdy již tato instance není zapotřebí, tak ji aplikace vrátí zpět do fondu pro budoucí využití.
### Structural
## Library class
Library class je jednoduchým návrhovým vzorem, jehož cílem je vytvoření obálky na statické metody podobného účelu. Příkladem mohou být knihovní třídy jazyků zabývající se elementární matematikou, například třída java.lang.Math v Javě. Protože jsou všechny metody statické, tak nemá smysl umožňovat ani dědění, ani tvorbu instancí, proto je třída finální a má soukromý konstruktor.
## Multiton
## Simple factory method
  

