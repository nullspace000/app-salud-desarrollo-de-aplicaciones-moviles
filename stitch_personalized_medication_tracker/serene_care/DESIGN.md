---
name: Serene Care
colors:
  surface: '#f8f9ff'
  surface-dim: '#ccdbf3'
  surface-bright: '#f8f9ff'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#eff4ff'
  surface-container: '#e6eeff'
  surface-container-high: '#dce9ff'
  surface-container-highest: '#d5e3fc'
  on-surface: '#0d1c2e'
  on-surface-variant: '#414753'
  inverse-surface: '#233144'
  inverse-on-surface: '#eaf1ff'
  outline: '#727784'
  outline-variant: '#c1c6d5'
  surface-tint: '#005db9'
  primary: '#005ab5'
  on-primary: '#ffffff'
  primary-container: '#1b73db'
  on-primary-container: '#fefcff'
  inverse-primary: '#aac7ff'
  secondary: '#006970'
  on-secondary: '#ffffff'
  secondary-container: '#7af1fc'
  on-secondary-container: '#006e75'
  tertiary: '#595c5e'
  on-tertiary: '#ffffff'
  tertiary-container: '#727577'
  on-tertiary-container: '#fbfdff'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#d6e3ff'
  primary-fixed-dim: '#aac7ff'
  on-primary-fixed: '#001b3e'
  on-primary-fixed-variant: '#00458e'
  secondary-fixed: '#7df4ff'
  secondary-fixed-dim: '#5dd8e2'
  on-secondary-fixed: '#002022'
  on-secondary-fixed-variant: '#004f54'
  tertiary-fixed: '#e0e3e5'
  tertiary-fixed-dim: '#c4c7c9'
  on-tertiary-fixed: '#191c1e'
  on-tertiary-fixed-variant: '#444749'
  background: '#f8f9ff'
  on-background: '#0d1c2e'
  surface-variant: '#d5e3fc'
typography:
  headline-lg:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 32px
    fontWeight: '700'
    lineHeight: 40px
    letterSpacing: -0.02em
  headline-lg-mobile:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 26px
    fontWeight: '700'
    lineHeight: 32px
  headline-md:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  body-lg:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 18px
    fontWeight: '400'
    lineHeight: 28px
  body-md:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  label-bold:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 14px
    fontWeight: '700'
    lineHeight: 20px
  dosage-display:
    fontFamily: Atkinson Hyperlegible Next
    fontSize: 40px
    fontWeight: '800'
    lineHeight: 48px
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  base: 8px
  container-margin: 20px
  gutter: 16px
  touch-target-min: 48px
  stack-sm: 12px
  stack-md: 24px
---

## Brand & Style

The design system is centered on a "Clinical-Soft" aesthetic—a hybrid of professional healthcare reliability and warm, approachable lifestyle design. The target audience spans from tech-savvy young adults managing supplements to seniors managing complex chronic prescriptions. The UI must evoke feelings of safety, calm, and competence.

The style leverages **Modern Corporate** foundations with **Tactile** influences. It avoids the coldness of traditional medical software by using soft surface transitions and gentle depth, ensuring the interface feels like a supportive companion rather than a rigid clinical tool. High legibility and clear affordances are the primary drivers of every visual decision.

## Colors

The palette is designed for high accessibility and psychological comfort. 

- **Primary (Medical Blue):** A reliable, high-contrast blue used for primary actions and brand presence.
- **Secondary (Calming Teal):** Used for progress indicators, secondary features, and wellness-related highlights.
- **Neutral/Surface:** A foundation of clean whites and extremely soft slate grays to minimize cognitive load.
- **Semantic Status:** 
  - **Taken (Green):** Highly saturated to provide a "success" dopamine hit.
  - **Pending (Orange):** Visible but non-threatening.
  - **Missed (Red):** Used sparingly to denote urgency without inducing anxiety.

Ensure a minimum contrast ratio of 4.5:1 for all functional text against its background.

## Typography

The design system utilizes **Atkinson Hyperlegible Next** across all roles. This typeface was specifically designed for low-vision readers, making it the perfect choice for a medication app where reading dosages correctly is critical.

- **Scale:** Font sizes are slightly larger than standard web defaults to accommodate older eyes.
- **Weight:** Use Semi-Bold and Bold for medication names; Regular for instructions.
- **Contextual Roles:** A specific "dosage-display" role is provided for high-visibility numerical information (e.g., "500 mg").

## Layout & Spacing

This design system uses a **Fluid Grid** model with a strict 8px spatial rhythm. 

- **Mobile:** Single column layout with 20px side margins to ensure thumbs don't accidentally trigger edge elements. 
- **Desktop/Tablet:** 12-column grid with a maximum content width of 1024px to keep line lengths readable for instructional text.
- **Touch Targets:** All interactive elements (buttons, checkboxes, navigation) must maintain a minimum 48x48px hit area to support users with limited dexterity or tremors.
- **Vertical Rhythm:** Generous white space between medication cards (stack-md) to prevent visual clutter and accidental taps.

## Elevation & Depth

Hierarchy is established through **Ambient Shadows** and **Tonal Layers**. 

1. **Base Level:** The background is the lightest neutral (Off-white).
2. **Card Level:** Medication cards and input containers use a pure white background with a very soft, diffused shadow (Blur: 15px, Opacity: 4%, Y-offset: 4px). This makes them appear "lifted" and interactable.
3. **Active Level:** When a card is tapped or an action is required, the shadow deepens slightly, and a 2px primary-colored border may appear.
4. **Modal Level:** Use a high-blur backdrop (20px) to focus the user's attention entirely on critical tasks like confirming a dosage.

## Shapes

The design system adopts a **Rounded** (Level 2) shape language. This softens the "industrial" feel of healthcare.

- **Cards/Containers:** Use 1rem (16px) corner radius.
- **Buttons:** Use 0.5rem (8px) for a sturdy, reliable feel, or fully pill-shaped (rounded-xl) for "Add" or "Confirm" actions.
- **Icons:** Use a 2px stroke weight with rounded caps and joins to match the soft UI.
- **Pill Visualizers:** When displaying the actual shape of a medication, use the specific geometric representation (oval, capsule, round) with smoothed corners.

## Components

- **Medication Cards:** The primary component. Must feature a clear title (Medication Name), a sub-label (Dosage/Time), and a high-contrast status icon.
- **Action Buttons:** Large, full-width primary buttons for "Mark as Taken." Use high-contrast white text on the primary blue background.
- **Status Chips:** Small, rounded indicators for "Morning," "Afternoon," or "Evening." Use subtle background tints (e.g., light blue background with dark blue text).
- **Checkboxes:** Large-scale (24px) with a custom "heavy" checkmark icon to ensure the "Taken" state is unmistakable.
- **Input Fields:** Soft borders (1px) that thicken and change to the primary blue on focus. Always include a persistent label above the field—never rely on placeholder text alone.
- **Progress Ring:** A secondary-colored (Teal) circular indicator showing the percentage of daily medications completed.
- **Time Picker:** A simplified, large-format wheel or button-grid designed for easy manipulation without precise fine-motor control.