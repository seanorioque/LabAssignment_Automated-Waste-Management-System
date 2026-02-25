Readme · MD
Copy

# ♻️ Automated Waste Management System

## 📋 Background

Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in **delays**, **inefficiencies**, and **high operational costs**. This system provides an innovative automated solution to ensure timely collection and disposal while optimizing resource utilization.

---

## 🎯 Objective

Develop an **Automated Waste Management System** that uses the **Chain of Responsibility** design pattern to ensure efficient waste collection and disposal. The system handles different types of waste containers and triggers appropriate disposal actions based on the **type** and **capacity** of each container.

---

## 📌 Requirements

| # | Requirement | Description |
|---|---|---|
| 1 | **Waste Container** | A class representing waste containers, each with a specific capacity and waste type (organic, recyclable, hazardous). |
| 2 | **Waste Collection Chain** | A chain of responsibility where each handler is responsible for collecting and disposing of a specific type of waste. |
| 3 | **Waste Collection Process** | The system initializes a chain of collectors, triggers disposal when a container is full, and routes the request to the appropriate handler. |
| 4 | **Validation** | Waste containers are correctly identified and disposed of by the appropriate collector in the chain. |

---

## 🗂️ Waste Types Handled

```
Organic  ──▶  Recyclable  ──▶  Hazardous
```

Each collector in the chain handles its designated waste type and passes unrecognized containers to the next handler.


