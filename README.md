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
#### Abstract factory
Abstract factory (Abstraktní továrna) je návrhový vzor, jehož jádrem je specifikace tovární třídy. Konkrétní implementace továrny je dosazena až za běhu programu, díky čemuž mohou být v programu vytvářeny výkonné objekty šité na míru dané situaci.
Obvyklou demonstrací tohoto vzoru je grafické uživatelské rozhraní. Grafické rozhraní má vypadat (a často i fungovat) na různých operačních systémech odlišně. Z tohoto důvodu je zapotřebí při startu aplikace zjistit, na jakém operačním systému se aplikace aktuálně nachází a inicializovat příslušnou továrnu, která bude aplikaci zásobovat implementacemi uživatelského rozhraní pro daný systém.
### Structural
#### Adapter
Návrhový vzor adapter (Wrapper) slouží pro definici jiného (stabilního) rozhraní, než daná třída poskytuje.
Příkladem z reálného života je adaptér do zásuvek. Pojedete-li do jiné země, tak tam velmi pravděpodobně narazíte na zásuvky, které mají jiný tvar a jiné napětí. Z tohoto důvodu je zapotřebí vložit mezi zařízení a zásuvku adaptér, který zajistí jak vhodné napětí, tak samotnou možnost zapojení (kvůli tvaru zásuvky).
Obdobně funguje návrhový adaptér. Máme nějakou třídu, jejíž rozhraní je z nějakého důvodu nevyhovující. Proto vytvoříme třídu adaptér, implementující požadované rozhraní, která bude dané volání překládat a volat adaptovanou třídu. Druhým častým důvodem použití adaptéru je nestabilita rozhraní adaptované třídy, například když tuto adaptovanou třídu (modul) vyvíjí jiná společnost. Potom je vhodné vytvořit adaptér, který se při změně rozhraní jednoduše upraví (v opačném případě by bylo nutné přepisovat všechna použití dané nestabilní třídy).
## Library class
Library class je jednoduchým návrhovým vzorem, jehož cílem je vytvoření obálky na statické metody podobného účelu. Příkladem mohou být knihovní třídy jazyků zabývající se elementární matematikou, například třída java.lang.Math v Javě. Protože jsou všechny metody statické, tak nemá smysl umožňovat ani dědění, ani tvorbu instancí, proto je třída finální a má soukromý konstruktor.
## Multiton
## Simple factory method
  

