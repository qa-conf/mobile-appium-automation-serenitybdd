#language: es

Característica:Buscar Videos en Youtube
  Yo como usuario
  Quiero buscar videos en Youtube
  Para relajarme

  Esquema del escenario: Buscar un video de manera exitosa
    Dado que Juan esta en la app
    Cuando busco el "<nombreVideo>"
    Entonces deberia de ver una lista de videos que quiera ver
    Ejemplos:
      | nombreVideo          |
      | Oblivion Lorna Shore |
