package org.example.factorymethod;

public class ObjetoFactory {

    private static  ObjetoFactory instance = new ObjetoFactory();
    private static Class<?> classePadrao;
    private static EntidadesJuridicas objetoPadrao;

    private ObjetoFactory() {}

    public static ObjetoFactory getInstance() {
        return instance;
    }

    public static Class<?> getClassePadrao() {
        return classePadrao;
    }

    public static EntidadesJuridicas getObjetoPadrao() {
        return objetoPadrao;
    }

    public static void setObjetoClasse(String tipoObjeto) {
        try {
            classePadrao = Class.forName("org.example.factorymethod." + tipoObjeto);
            Object obj = classePadrao.newInstance();
            objetoPadrao = (EntidadesJuridicas) obj;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Entidade Juridica inexistente", ex);
        }
    }
}
