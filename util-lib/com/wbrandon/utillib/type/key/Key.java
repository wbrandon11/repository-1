package com.wbrandon.utillib.type.key;

import java.awt.event.KeyEvent;
import java.util.Hashtable;

public enum Key
{
	
	ESCAPE(KeyEvent.VK_ESCAPE),
	F1(KeyEvent.VK_F1),
	F2(KeyEvent.VK_F2),
	F3(KeyEvent.VK_F3),
	F4(KeyEvent.VK_F4),
	F5(KeyEvent.VK_F5),
	F6(KeyEvent.VK_F6),
	F7(KeyEvent.VK_F7),
	F8(KeyEvent.VK_F8),
	F9(KeyEvent.VK_F9),
	F10(KeyEvent.VK_F10),
	F11(KeyEvent.VK_F11),
	F12(KeyEvent.VK_F12),
	F13(KeyEvent.VK_F13),
	F14(KeyEvent.VK_F14),
	F15(KeyEvent.VK_F15),
	F16(KeyEvent.VK_F16),
	F17(KeyEvent.VK_F17),
	F18(KeyEvent.VK_F18),
	F19(KeyEvent.VK_F19),
	F20(KeyEvent.VK_F20),
	F21(KeyEvent.VK_F21),
	F22(KeyEvent.VK_F22),
	F23(KeyEvent.VK_F23),
	F24(KeyEvent.VK_F24),
	
	TILDE(KeyEvent.VK_DEAD_TILDE),
	NUMBER_1(KeyEvent.VK_1),
	NUMBER_2(KeyEvent.VK_2),
	NUMBER_3(KeyEvent.VK_3),
	NUMBER_4(KeyEvent.VK_4),
	NUMBER_5(KeyEvent.VK_5),
	NUMBER_6(KeyEvent.VK_6),
	NUMBER_7(KeyEvent.VK_7),
	NUMBER_8(KeyEvent.VK_8),
	NUMBER_9(KeyEvent.VK_9),
	NUMBER_0(KeyEvent.VK_0),
	MINUS(KeyEvent.VK_MINUS),
	EQUALS(KeyEvent.VK_PLUS),
	BACKSPACE(KeyEvent.VK_BACK_SPACE),
	TAB(KeyEvent.VK_TAB),
	Q(KeyEvent.VK_Q),
	W(KeyEvent.VK_W),
	E(KeyEvent.VK_E),
	R(KeyEvent.VK_R),
	T(KeyEvent.VK_T),
	Y(KeyEvent.VK_Y),
	U(KeyEvent.VK_U),
	I(KeyEvent.VK_I),
	O(KeyEvent.VK_O),
	P(KeyEvent.VK_P),
	BRACKET_OPEN(KeyEvent.VK_OPEN_BRACKET),
	BRACKET_CLOSE(KeyEvent.VK_CLOSE_BRACKET),
	BACKSLASH(KeyEvent.VK_BACK_SLASH),
	@Deprecated
	CAPS_LOCK(KeyEvent.VK_CAPS_LOCK),
	A(KeyEvent.VK_A),
	S(KeyEvent.VK_S),
	D(KeyEvent.VK_D),
	F(KeyEvent.VK_F),
	G(KeyEvent.VK_G),
	H(KeyEvent.VK_H),
	J(KeyEvent.VK_J),
	K(KeyEvent.VK_K),
	L(KeyEvent.VK_L),
	SEMICOLON(KeyEvent.VK_SEMICOLON),
	QUOTES(KeyEvent.VK_QUOTE),
	@VKUnspecific
	RETURN(KeyEvent.VK_ENTER),
	@VKUnspecific
	SHIFT_LEFT(KeyEvent.VK_SHIFT),
	@VKUnspecific
	SHIFT_RIGHT(KeyEvent.VK_SHIFT),
	Z(KeyEvent.VK_Z),
	X(KeyEvent.VK_X),
	C(KeyEvent.VK_C),
	V(KeyEvent.VK_V),
	B(KeyEvent.VK_B),
	N(KeyEvent.VK_N),
	M(KeyEvent.VK_M),
	COMMA(KeyEvent.VK_COMMA),
	PERIOD(KeyEvent.VK_PERIOD),
	SLASH(KeyEvent.VK_SLASH),
	@VKUnspecific
	CONTROL_LEFT(KeyEvent.VK_CONTROL),
	@VKUnspecific
	CONTROL_RIGHT(KeyEvent.VK_CONTROL),
	@VKUnspecific
	OPTION_LEFT(KeyEvent.VK_ALT),
	@VKUnspecific
	OPTION_RIGHT(KeyEvent.VK_ALT),
	@VKUnspecific
	COMMAND_LEFT(KeyEvent.VK_META),
	@VKUnspecific
	COMMAND_RIGHT(KeyEvent.VK_META),
	SPACE(KeyEvent.VK_SPACE),
	
	HOME(KeyEvent.VK_HOME),
	PAGE_UP(KeyEvent.VK_PAGE_UP),
	PAGE_DOWN(KeyEvent.VK_PAGE_DOWN),
	DELETE(KeyEvent.VK_DELETE),
	END(KeyEvent.VK_END),
	
	ARROW_LEFT(KeyEvent.VK_LEFT),
	ARROW_RIGHT(KeyEvent.VK_RIGHT),
	ARROW_UP(KeyEvent.VK_UP),
	ARROW_DOWN(KeyEvent.VK_DOWN),
	
	NUMPAD_CLEAR(KeyEvent.VK_CLEAR),
	NUMPAD_ADD(KeyEvent.VK_ADD),
	NUMPAD_SUBTRACT(KeyEvent.VK_SUBTRACT),
	NUMPAD_MULTIPLY(KeyEvent.VK_MULTIPLY),
	NUMPAD_DIVIdE(KeyEvent.VK_DIVIDE),
	NUMPAD_1(KeyEvent.VK_NUMPAD1),
	NUMPAD_2(KeyEvent.VK_NUMPAD2),
	NUMPAD_3(KeyEvent.VK_NUMPAD3),
	NUMPAD_4(KeyEvent.VK_NUMPAD4),
	NUMPAD_5(KeyEvent.VK_NUMPAD5),
	NUMPAD_6(KeyEvent.VK_NUMPAD6),
	NUMPAD_7(KeyEvent.VK_NUMPAD7),
	NUMPAD_8(KeyEvent.VK_NUMPAD8),
	NUMPAD_9(KeyEvent.VK_NUMPAD9),
	NUMPAD_0(KeyEvent.VK_NUMPAD0),
	NUMPAD_DECIMAL(KeyEvent.VK_DECIMAL),
	@VKUnspecific
	NUMPAD_ENTER(KeyEvent.VK_ENTER);
	
	private static Hashtable<Integer, Key> keysForVKIds = new Hashtable<Integer, Key>();
	
	static
	{
		keysForVKIds.put(ESCAPE.vkId, ESCAPE);
		keysForVKIds.put(F1.vkId, F1);
		keysForVKIds.put(F2.vkId, F2);
		keysForVKIds.put(F3.vkId, F3);
		keysForVKIds.put(F4.vkId, F4);
		keysForVKIds.put(F5.vkId, F5);
		keysForVKIds.put(F6.vkId, F6);
		keysForVKIds.put(F7.vkId, F7);
		keysForVKIds.put(F8.vkId, F8);
		keysForVKIds.put(F9.vkId, F9);
		keysForVKIds.put(F10.vkId, F10);
		keysForVKIds.put(F11.vkId, F11);
		keysForVKIds.put(F12.vkId, F12);
		keysForVKIds.put(F13.vkId, F13);
		keysForVKIds.put(F14.vkId, F14);
		keysForVKIds.put(F15.vkId, F15);
		keysForVKIds.put(F16.vkId, F16);
		keysForVKIds.put(F17.vkId, F17);
		keysForVKIds.put(F18.vkId, F18);
		keysForVKIds.put(F19.vkId, F19);
		keysForVKIds.put(F20.vkId, F20);
		keysForVKIds.put(F21.vkId, F21);
		keysForVKIds.put(F22.vkId, F22);
		keysForVKIds.put(F23.vkId, F23);
		keysForVKIds.put(F24.vkId, F24);
		
		keysForVKIds.put(TILDE.vkId, TILDE);
		keysForVKIds.put(NUMBER_1.vkId, NUMBER_1);
		keysForVKIds.put(NUMBER_2.vkId, NUMBER_2);
		keysForVKIds.put(NUMBER_3.vkId, NUMBER_3);
		keysForVKIds.put(NUMBER_4.vkId, NUMBER_4);
		keysForVKIds.put(NUMBER_5.vkId, NUMBER_5);
		keysForVKIds.put(NUMBER_6.vkId, NUMBER_6);
		keysForVKIds.put(NUMBER_7.vkId, NUMBER_7);
		keysForVKIds.put(NUMBER_8.vkId, NUMBER_8);
		keysForVKIds.put(NUMBER_9.vkId, NUMBER_9);
		keysForVKIds.put(NUMBER_0.vkId, NUMBER_0);
		keysForVKIds.put(MINUS.vkId, MINUS);
		keysForVKIds.put(EQUALS.vkId, EQUALS);
		keysForVKIds.put(BACKSPACE.vkId, BACKSPACE);
		keysForVKIds.put(TAB.vkId, TAB);
		keysForVKIds.put(Q.vkId, Q);
		keysForVKIds.put(W.vkId, W);
		keysForVKIds.put(E.vkId, E);
		keysForVKIds.put(R.vkId, R);
		keysForVKIds.put(T.vkId, T);
		keysForVKIds.put(Y.vkId, Y);
		keysForVKIds.put(U.vkId, U);
		keysForVKIds.put(I.vkId, I);
		keysForVKIds.put(O.vkId, O);
		keysForVKIds.put(P.vkId, P);
		keysForVKIds.put(BRACKET_OPEN.vkId, BRACKET_OPEN);
		keysForVKIds.put(BRACKET_CLOSE.vkId, BRACKET_CLOSE);
		keysForVKIds.put(BACKSLASH.vkId, BACKSLASH);
		keysForVKIds.put(CAPS_LOCK.vkId, CAPS_LOCK);
		keysForVKIds.put(A.vkId, A);
		keysForVKIds.put(S.vkId, S);
		keysForVKIds.put(D.vkId, D);
		keysForVKIds.put(F.vkId, F);
		keysForVKIds.put(G.vkId, G);
		keysForVKIds.put(H.vkId, H);
		keysForVKIds.put(J.vkId, J);
		keysForVKIds.put(K.vkId, K);
		keysForVKIds.put(L.vkId, L);
		keysForVKIds.put(SEMICOLON.vkId, SEMICOLON);
		keysForVKIds.put(QUOTES.vkId, QUOTES);
		keysForVKIds.put(RETURN.vkId, RETURN);
		keysForVKIds.put(SHIFT_LEFT.vkId, SHIFT_LEFT);
		keysForVKIds.put(SHIFT_RIGHT.vkId, SHIFT_RIGHT);
		keysForVKIds.put(Z.vkId, Z);
		keysForVKIds.put(X.vkId, X);
		keysForVKIds.put(C.vkId, C);
		keysForVKIds.put(V.vkId, V);
		keysForVKIds.put(B.vkId, B);
		keysForVKIds.put(N.vkId, N);
		keysForVKIds.put(M.vkId, M);
		keysForVKIds.put(COMMA.vkId, COMMA);
		keysForVKIds.put(PERIOD.vkId, PERIOD);
		keysForVKIds.put(SLASH.vkId, SLASH);
		keysForVKIds.put(CONTROL_LEFT.vkId, CONTROL_LEFT);
		keysForVKIds.put(CONTROL_RIGHT.vkId, CONTROL_RIGHT);
		keysForVKIds.put(OPTION_LEFT.vkId, OPTION_LEFT);
		keysForVKIds.put(OPTION_RIGHT.vkId, OPTION_RIGHT);
		keysForVKIds.put(COMMAND_LEFT.vkId, COMMAND_LEFT);
		keysForVKIds.put(COMMAND_RIGHT.vkId, COMMAND_RIGHT);
		keysForVKIds.put(SPACE.vkId, SPACE);
		
		keysForVKIds.put(HOME.vkId, HOME);
		keysForVKIds.put(PAGE_UP.vkId, PAGE_UP);
		keysForVKIds.put(PAGE_DOWN.vkId, PAGE_DOWN);
		keysForVKIds.put(DELETE.vkId, DELETE);
		keysForVKIds.put(END.vkId, END);
		
		keysForVKIds.put(ARROW_LEFT.vkId, ARROW_LEFT);
		keysForVKIds.put(ARROW_RIGHT.vkId, ARROW_RIGHT);
		keysForVKIds.put(ARROW_UP.vkId, ARROW_UP);
		keysForVKIds.put(ARROW_DOWN.vkId, ARROW_DOWN);
		
		keysForVKIds.put(NUMPAD_CLEAR.vkId, NUMPAD_CLEAR);
		keysForVKIds.put(NUMPAD_ADD.vkId, NUMPAD_ADD);
		keysForVKIds.put(NUMPAD_SUBTRACT.vkId, NUMPAD_SUBTRACT);
		keysForVKIds.put(NUMPAD_MULTIPLY.vkId, NUMPAD_MULTIPLY);
		keysForVKIds.put(NUMPAD_DIVIdE.vkId, NUMPAD_DIVIdE);
		keysForVKIds.put(NUMPAD_1.vkId, NUMPAD_1);
		keysForVKIds.put(NUMPAD_2.vkId, NUMPAD_2);
		keysForVKIds.put(NUMPAD_3.vkId, NUMPAD_3);
		keysForVKIds.put(NUMPAD_4.vkId, NUMPAD_4);
		keysForVKIds.put(NUMPAD_5.vkId, NUMPAD_5);
		keysForVKIds.put(NUMPAD_6.vkId, NUMPAD_6);
		keysForVKIds.put(NUMPAD_7.vkId, NUMPAD_7);
		keysForVKIds.put(NUMPAD_8.vkId, NUMPAD_8);
		keysForVKIds.put(NUMPAD_9.vkId, NUMPAD_9);
		keysForVKIds.put(NUMPAD_0.vkId, NUMPAD_0);
		keysForVKIds.put(NUMPAD_DECIMAL.vkId, NUMPAD_DECIMAL);
		keysForVKIds.put(NUMPAD_ENTER.vkId, NUMPAD_ENTER);
		
	}

	public static Key forVKId(int vkId)
	{
		return keysForVKIds.get(vkId);
	}
	
	private int vkId;
	
	private Key(int vkId)
	{
		this.vkId = vkId;
	}
	
	public int getVKId() { return vkId; }
	
}
