/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lcluc
 */
public class Planejamentos {
    
    private int id;
    private String disciplina;
    private String horario_inicio;
    private String horario_encerramento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_encerramento() {
        return horario_encerramento;
    }

    public void setHorario_encerramento(String horario_encerramento) {
        this.horario_encerramento = horario_encerramento;
    }
    
    
    
}
