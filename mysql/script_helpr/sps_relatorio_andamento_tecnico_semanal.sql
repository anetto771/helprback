DELIMITER //
CREATE PROCEDURE sps_relatorio_andamento_tecnico_semanal(
IN idTecnico INT,
IN dt_hoje DATE
)
BEGIN
	CREATE TEMPORARY TABLE tmp_chamados_andamento_tecnico_semanal
    AS
    SELECT * FROM chamado
    WHERE tecnico_id = idTecnico AND status = 1 AND (data_abertura BETWEEN (dt_hoje - INTERVAL 7 DAY) AND dt_hoje);
    SELECT * FROM tmp_chamados_andamento_tecnico_semanal;
    DROP TABLE tmp_chamados_andamento_tecnico_semanal;
END //
DELIMITER ;

CALL sps_relatorio_andamento_tecnico_semanal(1, "2022-08-26");