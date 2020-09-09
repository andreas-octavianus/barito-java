SQL TEST
1. SELECT ponsel.merek, COUNT(ponsel.model) FROM ponsel WHERE ponsel.dualsim = TRUE GROUP BY ponsel.merek

2. SELECT DISTINCT tempattinggal
FROM senjata LEFT JOIN jenissenjata ON senjata.jenissenjataid = jenissenjata.id LEFT JOIN pahlawansuper ON senjata.pahlawansuperid = pahlawansuper.id
WHERE jenissenjata = 'Kapak'

3. SELECT *
FROM penduduk t3, ((SELECT t2.pendudukid AS pendudukid, t1.tanggalpisah
FROM perpisahan t1 LEFT JOIN pasangan t2 ON t1.pasanganid = t2.id)
UNION
(SELECT t2.pasanganid, t1.tanggalpisah
FROM perpisahan t1 LEFT JOIN pasangan t2 ON t1.pasanganid = t2.id) ORDER BY tanggalpisah desc) t4 WHERE t3.id = t4.pendudukid LIMIT 100