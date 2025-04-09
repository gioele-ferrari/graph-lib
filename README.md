# Graph Library 🚀

Questa applicazione in Java consente di creare e manipolare grafi orientati e non orientati direttamente da codice o da input testuali. È pensata per scopi didattici e sperimentali, offrendo una struttura chiara e modulare per lavorare con la teoria dei grafi.

---

## Struttura del Progetto

- `src/Graph.java`: Classe astratta di base per rappresentare un grafo.
- `src/DirectedGraph.java`: Implementazione di un grafo orientato.
- `src/UndirectedGraph.java`: Implementazione di un grafo non orientato.

---

## Funzionalità Principali

- Creazione di grafi orientati e non orientati.
- Aggiunta e rimozione di nodi e archi.

---

## Avvio del Programma

### Requisiti

- Java 17 o superiore
- Bash (per eseguire `run.sh` su Linux/macOS)

### Avvio

Per avviare l'app tramite lo script:

```bash
./run.sh
```

---

## 🛠️ Compilazione Manuale

Per compilare e creare il `.jar`:

```bash
jar cf Graph.jar -C out/ .
```