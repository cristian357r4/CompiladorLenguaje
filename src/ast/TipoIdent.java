/**
 * @generated VGen 1.3.3
 */

package ast;

import visitor.Visitor;

// tipoIdent:tipo -> nombre:String

public class TipoIdent extends AbstractTipo {

	private String nombre;

	public TipoIdent(String nombre) {
		this.nombre = nombre;
	}

	public TipoIdent(Object nombre) {
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getLexeme() : (String) nombre;

		searchForPositions(nombre); // Obtener linea/columna a partir de los hijos
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	// Extras
	private DefEstructura definicion;

	public void setDefinicion(DefEstructura definicion) {
		this.definicion = definicion;

	}

	public DefEstructura getDefinicion() {
		return definicion;
	}
}
